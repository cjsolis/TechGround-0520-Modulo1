package dataproviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import pojo.ProductsAndPricesData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ProductsAndPricesProvider {

    @DataProvider(name = "getProductsAndPricesDataFromJson")
    private Object[][] getProductsAndPricesDataFromJson() throws FileNotFoundException {

        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/data/productsANDprices.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataSet");
        List<ProductsAndPricesData> testData = new Gson().fromJson(dataSet, new TypeToken<List<ProductsAndPricesData>>() {}.getType());
        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }

        return returnValue;
    }
}
