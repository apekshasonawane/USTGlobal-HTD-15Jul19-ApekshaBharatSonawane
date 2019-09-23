import { Component, OnInit, Input } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewalltask',
  templateUrl: './viewalltask.component.html',
  styleUrls: ['./viewalltask.component.css']
})
export class ViewalltaskComponent implements OnInit {

  task: any = [];

  constructor(private taskservice:TaskserviceService,private router:Router) { }

  ngOnInit() {
   this.taskservice.getData();
  }


    updateTask(task) {
  this.taskservice.selectedTask = task;
  this.router.navigateByUrl('/addtask');
}
deleteTask(task) {
  this.taskservice.deleteData(task).subscribe(resData => {
    console.log(resData);
   this.taskservice.getData();
  });
}

  }

