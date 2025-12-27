package soumitra.example.mcp.mcplearning.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springaicommunity.mcp.annotation.McpResource;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class SoumitraMcptooladdition {

    public static Logger logger= LoggerFactory.getLogger(SoumitraMcptooladdition.class);

//    Tools
    @McpTool(name="Shopping List Generator", description="Generates a simple shopping list")
    public String shoppingList(){
        logger.info("Inside shoppingList method of SoumitraMcptooladdition");
        return "Milk, Eggs, Bread, Butter";
    }

    @McpTool(name="Christmas Wish List Generator", description="Generates a simple Christmas wish list")
    public String christmasWishList(){
        logger.info("Inside christmasWishList method of SoumitraMcptooladdition");
        return "toys, mickey mouse merchandise, chocolates";
    }

    @McpResource(name="getlist",uri="/current-list")
    @GetMapping("/current-list")
    public String currentList(){
        logger.info("Inside currentList method of SoumitraMcptooladdition");
        return "Current shopping list: Milk, Eggs, Bread, Butter";
    }

}
