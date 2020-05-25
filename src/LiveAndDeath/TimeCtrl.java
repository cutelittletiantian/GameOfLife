package LiveAndDeath;

public class TimeCtrl {
    UI ui = new UI();
    Map map;
    Logic logic = new Logic();
    TimeCtrl(){
        map = new Map(0.5);
    }
    TimeCtrl(double probability){
        map = new Map(probability);
    }
    public void run() {
        ui.init(map);
        for (int i = 0; i < map.getLen(); i++) {
            for (int j = 0; j < map.getLen(); j++) {
                System.out.print(map.get(i, j));
            }
            System.out.println();
        }
        try {
            while(true){
                ui.show(map);
                logic.update(map);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("运行结束");
        }
    }
}