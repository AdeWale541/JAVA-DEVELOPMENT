package Training1;



import javax.swing.JOptionPane;

public class Train3 {
    public static void main(String[] args) {
        double first_Name = Double.parseDouble(JOptionPane.showInputDialog("Length of triangle", "The Length of triangle is"));
//It was normally a string.To turn into an integer/Float,/double change variable from string to int/double/Float
//then put Integer.parseInt(The rest of the code). If you want to change to double, use  Double.parseDouble
//Do the same if you want to change to float
        String family_Name = JOptionPane.showInputDialog("Breadth of triangle", "Breadth of triangle is");
// alternatively, you could leave it as a string and convert it separately

//
        double area = first_Name * Double.parseDouble(family_Name);

        String full_Name = "Dimensions of triangle are  " + first_Name + " and  " + family_Name + ". The area is " + area ;
        JOptionPane.showMessageDialog(null, full_Name, "Name", JOptionPane.WARNING_MESSAGE);
        System.exit(0);



    }
}