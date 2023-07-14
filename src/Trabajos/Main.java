package Trabajos;

public class Main {
    public static void main(String[] args) {
        Addition addition= new Addition(); //Instancia: Creacción del objeto.
        addition.number1=14;
        addition.number2=7;
        System.out.println("The sum of "+ addition.number1 +"+"+ addition.number2 +" is equal to "+ addition.addition());

        Subtraction subtraction= new Subtraction();
        subtraction.number1=19;
        subtraction.number2=9;

        System.out.println("The subtraction of "+ subtraction.number1 +"-"+ subtraction.number2 +" is equal to "+ subtraction.subtraction());

        Division division= new Division();
        division.number1=21;
        division.number2=3;
        System.out.println("The division of "+ division.number1 +"/"+ division.number2 +" is equal to "+ division.division());

        Multiplication multiplication= new Multiplication();
        multiplication.number1=4;
        multiplication.number2=8;
        System.out.println("The multiplication of "+ multiplication.number1 +"*"+ multiplication.number2 +" is equal to "+ multiplication.multiplication());

        Personal_details details= new Personal_details();
        System.out.println(details.MostrarDatos());

                details.name= "Isabella";
                details.last_Name= "Arias Lemus";
                details.age= 15;
                details.single_woman= true;
                details.borrowed_Silver= 20000;
                details.favorite_Letter= 'C';
                details.salary= 5000000;
                details.money_Saved= 849789577L;
                details.approximate_Height= 165.7f;
                details.number_i_hate= 7.77;

        System.out.println("Personal Details \n Name:"+ details.name + "\n Last Name:"+ details.last_Name + "\n Age:"+ details.age
        + "\n Single Woman:"+ details.single_woman + "\n Borrowed Silver:"+ details.borrowed_Silver + "\n Favorite Letter:"+ details.favorite_Letter
        + "\n Salary:"+ details.salary + "\n Money Saved:"+ details.money_Saved + "\n Approximate Height:"+ details.approximate_Height+ "\n Number i hate:"+ details.number_i_hate);
    }
    }
