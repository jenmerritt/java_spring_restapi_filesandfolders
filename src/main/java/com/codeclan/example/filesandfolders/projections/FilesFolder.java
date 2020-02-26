package com.codeclan.example.filesandfolders.projections;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "filesFolder", types = File.class)
public interface FilesFolder {
    public String getName();
    public String getExt();
    public int getSize();
    public Folder getFolder();
}
