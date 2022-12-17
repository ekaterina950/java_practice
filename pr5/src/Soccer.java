import javax.swing.*; // для создания кнопки панели
import java.awt.*; // для гуи
import java.awt.event.ActionEvent; //для кнопки
import java.awt.event.ActionListener; // приведет к действиям при нажатии кнопки

public class Soccer {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Матч: Реал - Мадрид"); //главное окно
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // задать операцию, которая произойдет ,
        // если нажать на крест, exit... завершает работу
        jFrame.setVisible(true); // отображение окна
        jFrame.setLayout(null); // установка менеджера расположения
        jFrame.setSize(1280,720); // размер коробки как в хтмл

        JButton leftTeamGoalButton = new JButton(); //создание кнопок
        JButton rightTeamGoalButton = new JButton();
        leftTeamGoalButton.setText("Реал забил"); //текст в кнопке
        leftTeamGoalButton.setSize(150,100); // установка рзмера как в хтмл
        leftTeamGoalButton.setLocation(426,300); // установка позиции где будет
        rightTeamGoalButton.setText("Мадрид забил");
        rightTeamGoalButton.setSize(150,100);
        rightTeamGoalButton.setLocation(676,300);

        jFrame.add(leftTeamGoalButton); // добавление на панель
        jFrame.add(rightTeamGoalButton);

        final int[] RealScore = {0};
        final int[] MadridScore={0};

        JLabel table = new JLabel("Result: "+RealScore[0]+" X "+MadridScore[0]); //Таблица JTable позволяет отображать двухмерную
        // информацию в виде строк и столбцов, настраивать и сортировать данные, выводить их в любом подходящем виде,
        // управлять заголовками таблицы и ее выделенными элементами.
        table.setSize(200,100); // установка размера
        table.setFont(new Font("Verdana",Font.PLAIN,15));  //шрифт plain-обычный
        table.setBounds(570,120,200,100); //изменяет все свойста компонента
        jFrame.add(table);

        JLabel lastScorer = new JLabel("Last scorer: ");
        lastScorer.setSize(200,100);
        lastScorer.setFont(new Font("Verdana",Font.PLAIN,15));
        lastScorer.setBounds(570,150,200,100);
        jFrame.add(lastScorer);

        JLabel winnerLable = new JLabel("Winner: "); //текст с иконкой
        winnerLable.setSize(200,100);
        winnerLable.setFont(new Font("Verdana",Font.PLAIN,15));
        winnerLable.setBounds(570,90,200,100);
        jFrame.add(winnerLable);



        leftTeamGoalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //в addlistener это единственная функция
                //выполнение кода при нажатии на кнопку
                RealScore[0] +=1;
                table.setText("Result: "+RealScore[0]+" X "+MadridScore[0]);
                lastScorer.setText("Last scorer: Реал");
                if(MadridScore[0] == RealScore[0]){
                    winnerLable.setText("Winner: Ничья");
                }
                if(RealScore[0]> MadridScore[0]){
                    winnerLable.setText("Winner: Реал");
                }
            }
        });
        rightTeamGoalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MadridScore[0] +=1;
                table.setText("Result: "+RealScore[0]+" X "+MadridScore[0]);
                lastScorer.setText("Last scorer: Мадрид");
                if(MadridScore[0] == RealScore[0]){
                    winnerLable.setText("Winner: Ничья");
                }
                if(MadridScore[0]> RealScore[0]){
                    winnerLable.setText("Winner: Мадрид");
                }

            }
        });




        jFrame.setLocationRelativeTo(null); //переместить окно jframe в центр экрана

    }
}

