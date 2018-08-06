class Cycle {

}

class Unicycle extends Cycle {
    public void balance(){
        System.out.println("Balanced");
    }
}

class Bicycle extends Cycle {
    public void balance(){
        System.out.println("Balanced");
    }
}

class Tricycle extends Cycle {

}

public class Part2 {
    public static void main(String[] args){
        Cycle[] cyc = new Cycle[]{new Unicycle(), new Bicycle(), new Tricycle()};
		/*
		cyc[0].balance();
		cyc[1].balance();
		cyc[3].balance();
		*/
        Unicycle uni = (Unicycle)cyc[0];
        Bicycle bi = (Bicycle)cyc[1];
        Tricycle tri = (Tricycle)cyc[2];
        uni.balance();
        bi.balance();
        //tri.balance();//Tricycle class doesn't have balance method
    }

}