import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldReturnDemoAccounts() {
// Given - When - Then
// Предусловия
        given()
                .baseUri("http://localhost:9999/api/v1")
// Выполняемые действия
                .when()
                .get("/demo/accounts")
// Проверки
                .then()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=UTF-8")
// специализированные проверки - лучше
                .contentType(ContentType.JSON)
        ;
    }

}