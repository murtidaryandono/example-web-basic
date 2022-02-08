package id.daryandono.web.module.todo;

import lombok.Getter;
import lombok.Setter;

/**
 * A struct to modelling to-do list items
 * @author Murti Daryandono
 */
@Getter @Setter
public class Todo {
    private String item;
    private int status;
}
