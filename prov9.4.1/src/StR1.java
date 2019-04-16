public class StR1 {
    public static void main(String[] args) {
        Car e = new Car();
        Car k = new Car();



        k.color="Белый";//Способ потери объекта с помощью замены
        e=k;

        System.out.println(e.color);
        System.out.println(k.color);

       // e=null;//Спопосб потери обьекта с помощью  присвоения null
        //System.out.println(e.color);

    }
    public void foof(){ //помещение в стек
        barf();

    }
    //Ссылка навсегда перестает быть видимой,
    // следовательно barf покидает стек так как  его стек разрушен, поэтому x  теряется
    public void barf (){
        StR1 x = new StR1(); //ссылка x исчезнет в конце метода
    }
}

