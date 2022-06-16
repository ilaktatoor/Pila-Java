package LinkedList_tutorial;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainFrame extends JFrame {
    private JPanel mframe;
    private JButton addF;
    private JButton deleteF;
    private JButton searchF;
    private JTextField idF;
    private JTextField nombref;
    private JTextField apellidoF;
    private JTextField carreraF;
    private JTextArea showF;

    public mainFrame(){
        Pila<Estudiante> pilaEstu = new Pila<>();


        setContentPane(mframe);
        setTitle(" Registro estudiantes Pila LIFO ");
        setSize(550,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        addF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estudiante estudiante;
                Object id = idF.getText();
                String nombre = nombref.getText();
                String apellido = apellidoF.getText();
                String carrera = carreraF.getText();

                try{
                    pilaEstu.push(estudiante = new Estudiante(id,nombre,apellido,carrera));
                    showF.setText(pilaEstu.toString());

                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null,"Introdusca valores","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        deleteF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilaEstu.pop();
                showF.setText(pilaEstu.toString());
            }
        });
        searchF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            while ()

            }
        });
    }
    public static void main(String[] args) {
        mainFrame mframe = new mainFrame();
    }
}
