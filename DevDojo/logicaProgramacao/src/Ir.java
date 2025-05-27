public class Ir {
    public static void main(String[] args) {
        double salary = 13850;
        if(salary <= 1903.98){
            System.out.println("ISENTO");
        } else if (salary >= 1903.99 && salary <= 2826.65){
            System.out.println("7.5% > " + (salary * 0.075));
        } else if (salary >= 2826.66 && salary <= 3751.05) {
            System.out.println("15% > " + (salary * 0.15));
        } else if (salary >= 3751.06 && salary <= 4664.68) {
            System.out.println("22.5% > " + (salary * 0.225));
        } else {
            System.out.println("27.5% > " + (salary * 0.275));
        }
    }
}
