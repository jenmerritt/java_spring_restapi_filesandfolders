package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.User;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import com.codeclan.example.filesandfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user1 = new User("Harry Potter");
        userRepository.save(user1);

        User user2 = new User("Hermione Grainger");
        userRepository.save(user2);

        User user3 = new User("Ron Weasley");
        userRepository.save(user3);

        Folder folder1 = new Folder("DAtDA", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Ancient Runes", user2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Quidditch Drills", user1);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Charms", user3);
        folderRepository.save(folder4);

        File file1 = new File("defence", "txt", 100, folder3);
        fileRepository.save(file1);

        File file2 = new File("quaffle_skills", "txt", 200, folder3);
        fileRepository.save(file2);

        File file3 = new File("curses", "ppt", 500, folder1);
        fileRepository.save(file3);

        File file4 = new File("symbols", "ppt", 350, folder2);
        fileRepository.save(file4);

        File file5 = new File("wingardium_leviosa", "doc", 150, folder4);
        fileRepository.save(file5);

        File file6 = new File("writing", "doc", 120, folder2);
        fileRepository.save(file6);

    }

}
