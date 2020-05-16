
package aplikasiLaundry;


public class MVC_Laundry {
    
    ViewLaundry viewlaundry = new ViewLaundry();
    ModelLaundry modellaundry = new ModelLaundry();
    ControllerLaundry controllerlaundry = new ControllerLaundry(modellaundry,viewlaundry);
    
}
