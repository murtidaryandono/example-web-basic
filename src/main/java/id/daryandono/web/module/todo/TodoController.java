package id.daryandono.web.module.todo;

import com.blade.mvc.annotation.*;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;

/**
 * Controller to handle various function related to to-do list
 * @author Murti Daryandono
 */
@Path
public class TodoController {

    /**
     * Function to show to-do list page
     * @param request http request received
     * @param request http response to be returned
     */
    @GetRoute("/todo")
    public void index(Request request, Response response){
        response.render("index.html");
    }

    @PostRoute("/todo")
    public void addTodo(Request request){
    }

    @PutRoute("/todo")
    public void updateTodo(Request request){
    }

    @DeleteRoute("/todo")
    public void removeTodo(Request request){
    }
}
