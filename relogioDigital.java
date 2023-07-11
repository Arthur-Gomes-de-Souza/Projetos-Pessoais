import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
public class relogioDigital extends JFrame {
    private JLabel labelTempo;
    private JLabel labelData;

    public relogioDigital() {
        setTitle("Relogio Digital");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // CRIAR PAINEL PARA AS LABELS DE TEMPO E DATA:
        JPanel painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        painel.setLayout(new BorderLayout());

        // CRIAR LABEL PARA O DISPLAY DO TEMPO:
        labelTempo = new JLabel();
        labelTempo.setFont(new Font("Arial", Font.PLAIN, 60));
        labelTempo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTempo.setVerticalAlignment(SwingConstants.CENTER);
        labelTempo.setForeground(Color.RED);

        // CRIAR LABEL PARA O DISPLAY DA DATA:
        labelData = new JLabel();
        labelData.setFont(new Font("Arial", Font.PLAIN, 20));
        labelData.setHorizontalAlignment(SwingConstants.CENTER);
        labelData.setVerticalAlignment(SwingConstants.CENTER);
        labelData.setForeground(Color.WHITE);

        // ADICIONANDO AS LABELS DE TEMPO E DATA NO PAINEL:
        painel.add(labelTempo, BorderLayout.CENTER);
        painel.add(labelData, BorderLayout.SOUTH);

        // DEFININDO COR DE FUNDO DO PAINEL:
        painel.setBackground(Color.BLACK);

        // ADICIONANDO PAINEL:
        add(painel);

        // ATUALIZANDO A DATA E O TEMPO:
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarTempoeData();
            }
        });
        timer.start();
    }

    private void atualizarTempoeData() {
        // PEGAR O TEMPO ATUAL E FORMATAR:
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat formatadorTempo = new SimpleDateFormat("HH:mm:ss");
        String tempo = formatadorTempo.format(calendario.getTime());

        // PEGAR A DATA ATUAL E FORMATAR:
        SimpleDateFormat formatadorData = new SimpleDateFormat("EEE, MMM dd, yyyy");
        String data = formatadorData.format(calendario.getTime());

        // ATUALIZAR O TEMPO E DATA:
        labelTempo.setText(tempo);
        labelData.setText(data);
    }

    public static void main(String[] args) {
        relogioDigital relogio = new relogioDigital();
        relogio.setVisible(true);
    }
}
