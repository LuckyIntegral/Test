package ua.aom.alevel.dao;

import ua.aom.alevel.dto.CourseDto;
import ua.aom.alevel.entity.Course;

import java.util.List;

public interface CourseDao extends BaseEntityDao<Course> {
    List<CourseDto> findCourseDto();
}
