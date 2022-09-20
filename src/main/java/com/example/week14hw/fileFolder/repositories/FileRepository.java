package com.example.week14hw.fileFolder.repositories;

import com.example.week14hw.fileFolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
