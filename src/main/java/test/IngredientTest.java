package test;

import edu.restaurant.app.dao.entity.DishIngredient;
import edu.restaurant.app.dao.entity.Ingredient;
import edu.restaurant.app.dao.operations.CrudOperations;
import edu.restaurant.app.dao.operations.IngredientCrudOperations;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class IngredientTest implements CrudOperations<Ingredient> {

    @Test
    public void getAll() {
        IngredientCrudOperations ingredient = new IngredientCrudOperations();

        List<Ingredient> ingredients = ingredient.getAll(1, 10);

        System.out.println(ingredients);
        assertTrue(ingredients.isEmpty());

    }

    @Override
    public List<Ingredient> getAll(int page, int size) {
        return List.of();
    }

    @Override
    public Ingredient findById(Long id) {
        return new Ingredient();
    }

    @Test
    public void findByDishId() {
        IngredientCrudOperations ingredient = new IngredientCrudOperations();

        List<DishIngredient> ingredients = ingredient.findByDishId(1L);

        System.out.println(ingredients);
        assertTrue(ingredients.isEmpty());
    }

    @Override
    public List<Ingredient> saveAll(List<Ingredient> entities) {
        return List.of();
    }
}
