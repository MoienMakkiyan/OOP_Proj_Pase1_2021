package Functions;

import Objects.Logger;
import Objects.Products.Egg;
import Objects.User;

public class GAME_ORDERS {

    private static GAME_ORDERS instance = null;

    private GAME_ORDERS(){
    }

    //Logger logger;

    //Variable_Reading variable_reading;
    //Main_Manager main_manager;

    /*public GAME_ORDERS(Logger logger, Variable_Reading variable_reading, Main_Manager main_manager) {
        this.logger = logger;
        this.variable_reading = variable_reading;
        this.main_manager = main_manager;
    }*/

    String Animal_Name = "Chicken Ostrich Buffalo Cat Dog";
    String Workshops_Name = "MilkPacking Mill Textile Bakery IcecreamShop Tailoring";

    public boolean Buy (String name , User user){
        if (Animal_Name.contains(name)){
            if (name.equalsIgnoreCase("Chicken")){
                if (user.getCoin()-variable_reading.item_cost_buying("Chicken")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Chicken"));
                    main_manager.Add_Animal("Chicken");
                    //TODO
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Ostrich")){
                if (user.getCoin()-variable_reading.item_cost_buying("Ostrich")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Ostrich"));
                    main_manager.Add_Animal("Ostrich");
                    //TODO
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Buffalo")){
                if (user.getCoin()-variable_reading.item_cost_buying("Buffalo")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Buffalo"));
                    main_manager.Add_Animal("Buffalo");
                    //TODO
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Cat")){
                if (user.getCoin()-variable_reading.item_cost_buying("Cat")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Cat"));
                    main_manager.Add_Animal("Cat");
                    //TODO
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Dog")){
                if (user.getCoin()-variable_reading.item_cost_buying("Dog")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Dog"));
                    main_manager.Add_Animal("Dog");
                    //TODO
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
        }
        if (Workshops_Name.contains(name)){
            if (name.equalsIgnoreCase("MilkPacking")){
                if (user.getCoin()-variable_reading.item_cost_buying("MilkPacking")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("MilkPacking"));
                    main_manager.Add_WorkShop("MilkPacking");
                    //TODO
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Mill")){
                if (name.equalsIgnoreCase("Mill")){
                    if (user.getCoin()-variable_reading.item_cost_buying("Mill")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Mill"));
                        main_manager.Add_WorkShop("Mill");
                        //TODO
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Textile")){
                if (name.equalsIgnoreCase("Textile")){
                    if (user.getCoin()-variable_reading.item_cost_buying("Textile")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Textile"));
                        main_manager.Add_WorkShop("Textile");
                        //TODO
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Bakery")){
                if (name.equalsIgnoreCase("Bakery")){
                    if (user.getCoin()-variable_reading.item_cost_buying("Bakery")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Bakery"));
                        main_manager.Add_WorkShop("Bakery");
                        //TODO
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("IcecreamShop")){
                if (name.equalsIgnoreCase("IcecreamShop")){
                    if (user.getCoin()-variable_reading.item_cost_buying("IcecreamShop")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("IcecreamShop"));
                        main_manager.Add_WorkShop("IcecreamShop");
                        //TODO
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Tailoring")){
                if (name.equalsIgnoreCase("Tailoring")){
                    if (user.getCoin()-variable_reading.item_cost_buying("Tailoring")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Tailoring"));
                        main_manager.Add_WorkShop("Tailoring");
                        //TODO
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
        }
        return false;//must be Edited in debuging
    }

    public boolean Pickup (int x , int y , User user){
        if (main_manager.add_to_warehouse(x-1,y-1)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Well (User user){
        if (main_manager.Well()){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Plant (int x , int y , User user){
        if (main_manager.AddGrass(x,y)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Work (String name , User user){
        if (name.equalsIgnoreCase("MilkPacking")){
            main_manager.MilkPacking_Work();
        }
        else if (name.equalsIgnoreCase("Mill")){
            main_manager.Mill_Work();
        }
        else if (name.equalsIgnoreCase("Textile")){
            main_manager.Textile_Work();
        }
        else if (name.equalsIgnoreCase("Bakery")){
            main_manager.Bakery_Work();
        }
        else if (name.equalsIgnoreCase("IcecreamShop")){
            main_manager.IcecreamShop_Work();
        }
        else if (name.equalsIgnoreCase("Tailoring")){
            main_manager.Tailoring_Work();
        }
        return true;
    }

    public boolean Cage (int x , int y , User user) {
        if (main_manager.Cage(x,y)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Turn (int n , User user){
        if (main_manager.changeTurn(n)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Truck_Load (String name , User user){
        if (main_manager.inWerehouse(name)){
            if (main_manager.Truck_Load(name)){
                //TODO
                return true;
            }
            else {
                //TODO
                return false;
            }
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Truck_Unload (String name , User user){
        if (main_manager.Truck_Unload(name)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Truck_Go (User user){
        if (main_manager.Truck_Go()){
            user.setCoin(user.getCoin()+ main_manager.SELLING_PROFIT());
            return true;
        }
        else {
            return false;
        }
    }

    public void set_level_tasks(int level, User user){

    }

    public static GAME_ORDERS getInstance(){
        if (instance == null)
            instance = new GAME_ORDERS();
        return instance;
    }
}
