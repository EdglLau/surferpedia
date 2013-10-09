package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Page1;
import views.html.Skip;
import views.html.Megan;
import views.html.Kyuss;
import views.html.Anastasia;
import views.html.JohnJohnFlorence;
import views.html.jake;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
    
  }
  
  public static Result Skip() {
    return ok(Skip.render(""));
    
  }
  
  public static Result Megan() {
    return ok(Megan.render(""));
    
  }
  
  public static Result Anastasia() {
    return ok(Anastasia.render(""));
    
  }
  
  public static Result Kyuss() {
    return ok(Kyuss.render(""));
    
  }
  
  /**
   * Returns John John Florence Page.
   * @return The John John Florence Page.
   */
  public static Result JohnJohnFlorence() {
    return ok(JohnJohnFlorence.render(""));
    
  }
  /**
   * Returns Jake page.
   * @return Jake Page.
   */
  public static Result jake() {
    return ok(jake.render(""));
    
  }
}
