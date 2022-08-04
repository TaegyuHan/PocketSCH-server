package gdscsch.PocketSCHserver.test.controller;


import gdscsch.PocketSCHserver.test.dto.TestDto;
import gdscsch.PocketSCHserver.response.DefaultRes;
import gdscsch.PocketSCHserver.response.StatusCode;
import gdscsch.PocketSCHserver.test.servcie.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @GetMapping("/test")
    public ResponseEntity test() {
        TestDto res = testService.testServiceMethod("hello");

        return new ResponseEntity(DefaultRes.res(StatusCode.OK, res.getTestStr()), HttpStatus.OK);
    }
}