package com.bat.battodo.services;


import com.bat.battodo.dtos.CategoryDTO;

import java.util.List;

public interface CategoryService {

    CategoryDTO saveSubTask(CategoryDTO categoryDTO);
    CategoryDTO getCategoryByName(String name);
    List<CategoryDTO> getAllCategories();
    CategoryDTO updateSubTask(CategoryDTO subTaskDTORequest);
    void deleteCategoryByName(String name);
}
