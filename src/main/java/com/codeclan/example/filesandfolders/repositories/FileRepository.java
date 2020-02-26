package com.codeclan.example.filesandfolders.repositories;
import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.projections.FilesFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = FilesFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {

}
