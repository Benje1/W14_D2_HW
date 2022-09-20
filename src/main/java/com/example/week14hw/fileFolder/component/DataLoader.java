package com.example.week14hw.fileFolder.component;

import com.example.week14hw.fileFolder.models.File;
import com.example.week14hw.fileFolder.models.Folder;
import com.example.week14hw.fileFolder.models.Person;
import com.example.week14hw.fileFolder.repositories.FileRepository;
import com.example.week14hw.fileFolder.repositories.FolderRepository;
import com.example.week14hw.fileFolder.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person person = new Person("Bob");
        Person person2 = new Person("Bobbie");
        personRepository.save(person);
        personRepository.save(person2);
        Folder folder = new Folder("file folder", person);
        Folder folder2 = new Folder("file container", person);
        folderRepository.save(folder);
        folderRepository.save(folder2);
        File file = new File("Image",".jpg", 50, folder);
        File file2 = new File("Text",".md", 40, folder);
        File file3 = new File("Word",".txt", 10, folder2);
        File file4 = new File("Another image",".jpg", 54, folder);
        File file5 = new File("Photo",".img", 70, folder2);
        File file6 = new File("Not an Image",".jpg", 50, folder);
        fileRepository.save(file);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
        fileRepository.save(file5);
        fileRepository.save(file6);
    }
}
