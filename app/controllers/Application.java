package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Skip;
import views.html.Megan;
import views.html.Kyuss;
import views.html.Anastasia;
import views.html.JohnJohnFlorence;
import views.html.Jake;

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
   * Returns the Skip page.
   * @return Skip.
   */
  public static Result skip() {
    return ok(Skip.render(""));
    
  }
  
  /**
   * Returns the Megan page.
   * @return Megan.
   */
  public static Result megan() {
    return ok(Megan.render(""));
  }
  
  /**
   * Returns the Anastasia page.
   * @return Anastasia.
   */
  public static Result anastasia() {
    return ok(Anastasia.render(""));
  }
  
  /**
   * Returns the Kyuss page.
   * @return Kyuss.
   */
  public static Result kyuss() {
    return ok(Kyuss.render(""));
  }
  
  /**
   * Returns John John Florence Page.
   * @return The John John Florence Page.
   */
  public static Result johnJohnFlorence() {
    return ok(JohnJohnFlorence.render(""));  
  }
  /**
   * Returns Jake page.
   * @return Jake Page.
   */
  public static Result jake() {
    return ok(Jake.render(""));
  }
}
