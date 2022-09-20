package com.example.week14hw.fileFolder.repositories;

import com.example.week14hw.fileFolder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
