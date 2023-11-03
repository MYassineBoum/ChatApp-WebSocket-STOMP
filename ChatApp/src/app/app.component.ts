import { Component, OnInit } from '@angular/core';
import * as Stomp from 'stompjs';
import * as SockJS from 'sockjs-client';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent implements OnInit {
  title = "ChatApp";
  newmessage!: string;
  publicMessages: string[] = [];
  private stompClient!: Stomp.Client;

  ngOnInit() {
      this.connect();
  }

  connect() {
    const socket = new SockJS('http://localhost:9092/ws');
    this.stompClient = Stomp.over(socket);
    const _this = this;
    this.stompClient.connect({}, function (frame) {
      _this.stompClient.subscribe('/topic', function(received){
        _this.showMessage(JSON.parse(received.body));
      });
   });
  }
  
  sendMessage() {
    this.stompClient.send(
      '/app/public',
      {},
      JSON.stringify(this.newmessage)
    );
    this.newmessage = "";
  }

  showMessage(message: string) {
    this.publicMessages.push(message);
  }

}
