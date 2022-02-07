package id.daryandono.web.module.todo;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Request;

@Path
public class TodoController {
    @GetRoute("/")
    public static String index(Request request){
        return "index.html";
    }
}
