package com.isofh.his.controller;

import com.isofh.his.dto.ChooseRoleRequest;
import com.isofh.his.dto.JwtAuthenticationResponse;
import com.isofh.his.dto.LoginRequest;
import com.isofh.his.dto.ResponseMsg;
import com.isofh.his.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController extends BaseController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider tokenProvider;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<ResponseMsg> login(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsernameOrEmail(), loginRequest.getPassword())
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.generateToken(authentication);

        return response("authentication", new JwtAuthenticationResponse(jwt));
    }

    @RequestMapping(value = "/chooseRole", method = RequestMethod.POST)
    public ResponseEntity<ResponseMsg> chooseRole(@Valid @RequestBody ChooseRoleRequest chooseRoleRequest) {

        return null;
    }
}
