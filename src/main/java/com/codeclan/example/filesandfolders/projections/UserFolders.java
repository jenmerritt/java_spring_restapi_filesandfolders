package com.codeclan.example.filesandfolders.projections;

import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "userFolders", types = User.class)
public interface UserFolders {

        public String getName();
        List<Folder> getFolders();

}
