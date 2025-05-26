public class SalarioIfElse {
    public static void main(String[] args){
        float salary = 4200.50F;
        float resultado = 0F;
        String porcentagem = "";
        if (salary > 4500){
            resultado = salary * 0.30F;
            porcentagem = "30% do salário: ";
        } else {
            resultado = salary * 0.15F;
            porcentagem = "15% do salário: ";
        }
        System.out.println(porcentagem + resultado);
    }
}
