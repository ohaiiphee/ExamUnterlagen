package LastYearsExam;

public class CookSubscription {
    String firstBox(int age, boolean vegan, boolean veggie, int activePerWeek) {
        if(vegan){
            return "Vegan";
        }
        if(veggie){
            return "Veggie";
        }
        if(activePerWeek >= 4 && age <= 60){
            return "Fish";
        }
        if(age <= 20 || age > 60){
            return "Veggie";
        }
        return "Vegan";
    }

    double[] suggestPrice(String box, int age){

       double[] erg = new double[2];

       if(box.equals("Fish")){
           if(age <= 25){
               erg[0] = 39.90;
           }else{
               erg[0]  = 49.90;
           }

           erg[1] = 80;
       }
       if(box.equals("Veggie")){
           if(age <= 25 || age > 60){
               erg[0] = 19.90;
           }else{
               erg[0]  = 29.90;
           }

           erg[1] = 42;

       }
       if(box.equals("Vegan")){
           if(age < 30){
               erg[1] = 45;
           }else{
               erg[1]  = 49.90;
           }

           erg[0] = 15;

       }
       return erg;
    }

}
