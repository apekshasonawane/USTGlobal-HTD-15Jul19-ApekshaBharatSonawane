import { Component, OnInit, Input } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  tasks:any=[];

  constructor(private taskservice:TaskserviceService,private router:Router) { }

  ngOnInit() {
  }
  sendTask(task){
  if (task.value.id) {
    this.taskservice.updateData(task.value).subscribe(resData => {
      console.log(resData);
      this.taskservice.getData();
      task.reset();
      this.router.navigateByUrl('/viewalltask');
    }, err => {
      console.log(err);
    });
  } else {
  this.taskservice.postData(task.value).subscribe((data) => {
    console.log(data);
    this.taskservice.getData();
    task.reset();
    this.router.navigateByUrl('/viewalltask');
  }, err => {
    console.log(err);
  });
}
  }
}
