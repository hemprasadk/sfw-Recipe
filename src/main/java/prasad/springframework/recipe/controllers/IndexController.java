package prasad.springframework.recipe.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import prasad.springframework.recipe.Services.RecipeServices;
import prasad.springframework.recipe.model.Category;
import prasad.springframework.recipe.model.UnitOfMeasure;
import prasad.springframework.recipe.repositories.CategoryRepository;
import prasad.springframework.recipe.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
@Slf4j
public class IndexController {

    public IndexController(RecipeServices reciepeService) {
        this.reciepeService = reciepeService;
    }

    private RecipeServices reciepeService;


    @RequestMapping({"/","","index"})
    public String getIndexPage(Model model)
    {
        log.debug("inside the controoller");
        model.addAttribute("recipes",reciepeService.getRecipe());

        return "index";
    }
}
