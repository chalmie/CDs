import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
  staticFileLocation("/public");
  String layout = "templates/layout.vtl";

  get("/", (request, response) -> {
    HashMap<String, Object> model = new HashMap<String, Object>();

    model.put("cds", request.session().attribute("cds"));
    model.put("template", "templates/index.vtl");
    return new ModelAndView(model, layout);
 }, new VelocityTemplateEngine());

  post("/success", (request, response) -> {
    HashMap<String, Object> model = new HashMap<String, Object>();

    ArrayList<CD> cds = request.session().attribute("cds");

    if(cds == null) {
      cds = new ArrayList<CD>();
      request.session().attribute("cds", cds);
    }

    String title = request.queryParams("title");
    String artist = request.queryParams("artist");

    CD newCD = new CD(title, artist);
    request.session().attribute("cd", newCD);

    cds.add(newCD);
    model.put("cds", request.session().attribute("cds"));
    model.put("template", "templates/index.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());
  }
}
