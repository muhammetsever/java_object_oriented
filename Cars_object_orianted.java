public class Cars_object_orianted {
    //Nitelikler
    String type;
    String color;
    String model;
    int speed;
    int speedLimit = 200;

    Cars_object_orianted(String model,int speed){
        this.model = model;

        this.speed = speed;
    }

    //Eylemler

    void speedUp(int up){
        if(speed + up <= speedLimit){
            speed += up;
        }
    }

    void speedDown(int down){
        if(speed > 0){
            speed -=down;
        }
    }
    void printSpeed(){
        System.out.println(model+ " "+ type +" Hız: "+ speed);
    }
}
