//package az.joinus.controller;
//
//import az.joinus.dto.ResponseDTO;
//import az.joinus.dto.UserFavoritePostDTO;
//import az.joinus.dto.UserFavoriteSearchDTO;
//import az.joinus.dto.UserInfoGetDTO;
//import az.joinus.service.abstraction.UserFavoriteService;
//import az.joinus.service.abstraction.WishlistService;
//import az.joinus.service.implementation.UserServiceImpl;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("profiles")
//@CrossOrigin("*")
//public class UserController {
//
//    private final UserServiceImpl userService;
//    private final UserFavoriteService userFavoriteService;
//
//    @GetMapping("/{username}")
//    public ResponseEntity<ResponseDTO> getUserPage(@PathVariable String username) {
//        return new ResponseEntity<>(ResponseDTO.builder()
//                .success(userService.userExists(username))
//                .build(), HttpStatus.OK);
//    }
//
//    @GetMapping("/my-information")
//    public ResponseEntity<ResponseDTO> getUserInfo(String username) {
//        return new ResponseEntity<>(ResponseDTO.builder()
//                .success(true)
//                .data(userService.getUserInfo(username))
//                .build(), HttpStatus.OK);
//    }
//
//    @GetMapping("/favorites")
//    public ResponseEntity<ResponseDTO> getFavorites(String username, int page, int size) {
//        return new ResponseEntity<>(ResponseDTO.builder()
//                .success(true)
//                .data(userFavoriteService.getAll(username, page, size))
//                .build(), HttpStatus.OK);
//    }
//
//    @PostMapping("/favorites")
//    public ResponseEntity<ResponseDTO> postFavorite(@RequestBody UserFavoritePostDTO postDTO) {
//        return new ResponseEntity<>(ResponseDTO.builder()
//                .success(true)
//                .data(userFavoriteService.post(postDTO))
//                .build(), HttpStatus.OK);
//    }
//}
