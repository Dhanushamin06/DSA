import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame implements ActionListener {
    private final JButton[][] buttons = new JButton[3][3];
    private final JLabel statusLabel = new JLabel("Player X's turn", SwingConstants.CENTER);
    private boolean xTurn = true;
    private int moves = 0;

    public App() {
        setTitle("Tic-Tac-Toe");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        boardPanel.setBackground(Color.DARK_GRAY);

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                buttons[r][c] = new JButton("");
                buttons[r][c].setFont(new Font("Arial", Font.BOLD, 50));
                buttons[r][c].setFocusPainted(false);
                buttons[r][c].addActionListener(this);
                boardPanel.add(buttons[r][c]);
            }
        }

        statusLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        statusLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(boardPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (!clicked.getText().equals(""))
            return;

        if (xTurn) {
            clicked.setText("X");
            clicked.setForeground(Color.BLUE);
            statusLabel.setText("Player O's turn");
        } else {
            clicked.setText("O");
            clicked.setForeground(Color.RED);
            statusLabel.setText("Player X's turn");
        }

        moves++;
        if (checkWin()) {
            statusLabel.setText("Player " + (xTurn ? "X" : "O") + " wins!");
            disableBoard();
        } else if (moves == 9) {
            statusLabel.setText("It's a draw!");
        } else {
            xTurn = !xTurn;
        }
    }

    private boolean checkWin() {
        String[][] b = new String[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                b[r][c] = buttons[r][c].getText();
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!b[i][0].equals("") && b[i][0].equals(b[i][1]) && b[i][0].equals(b[i][2]))
                return true;
            if (!b[0][i].equals("") && b[0][i].equals(b[1][i]) && b[0][i].equals(b[2][i]))
                return true;
        }
        if (!b[0][0].equals("") && b[0][0].equals(b[1][1]) && b[0][0].equals(b[2][2]))
            return true;
        if (!b[0][2].equals("") && b[0][2].equals(b[1][1]) && b[0][2].equals(b[2][0]))
            return true;
        return false;
    }

    private void disableBoard() {
        for (JButton[] row : buttons) {
            for (JButton btn : row) {
                btn.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App().setVisible(true));
    }
}
