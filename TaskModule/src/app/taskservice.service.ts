import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Task } from './viewalltask/task';


@Injectable({
  providedIn: 'root'
})
export class TaskserviceService {
 url:any  ='https://task-38db2.firebaseio.com/';

selectedTask : Task={
taskname:null,
id:null
};
 tasks:any=[];

  constructor(private http:HttpClient) { }

  getData(){
this.http.get(`${this.url}task.json`).pipe(map(resData => {
  const taskArray = [];
  for(let key in resData){
    taskArray.push({...resData[key] , id: key});
  }
  return taskArray;
})).subscribe(data => {
  this.tasks = data;
  console.log(data);
}, err => {
  console.log(err);
});
  }
deleteData(data){
return this.http.delete(`${this.url}task/${data.id}.json`,data);

}
updateData(data){
return this.http.put(`${this.url}task/${data.id}.json`,data);
}
postData(data){
return this.http.post (`${this.url}task.json`,data);
}

}
