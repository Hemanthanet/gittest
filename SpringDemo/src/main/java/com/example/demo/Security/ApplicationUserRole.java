package com.example.demo.Security;

import com.google.common.collect.Sets;

import java.util.Set;
import static com.example.demo.Security.ApplicationUserPermission.*;

public enum ApplicationUserRole {

    STUDENT(Sets.newHashSet()),
    //ADMIN(Sets.newHashSet(ApplicationUserPermission.STUDENT_READ,ApplicationUserPermission.STUDENT_WRITE,ApplicationUserPermission.COURSE_READ,ApplicationUserPermission.COURSE_WRITE));
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE,STUDENT_WRITE,STUDENT_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
