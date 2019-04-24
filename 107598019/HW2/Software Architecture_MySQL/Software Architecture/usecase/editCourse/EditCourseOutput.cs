﻿using Software_Architecture.adapter;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Software_Architecture.usecase.editCourse
{
    public interface EditCourseOutput
    {
        void setNewTitle(string newTitle);
        string getNewTitle();
        ViewModel getViewModel();
    }
}
