
  $(document).ready(function(){
    $("#sendMessageBtn").click(function(){

      var message = $("#messageInput").val().trim();
      if(message !== ""){
        sendMessage(message);
        $("#messageInput").val("");
        // Simulate bot response (replace with your actual chatbot logic)
        setTimeout(function(){
          receiveMessage("Sure, This is the sample answer!!");
          scrollToBottom();
        }, 1000);
      }
    });

    function sendMessage(message) {
      var html = `
        <div class="message message-sender">
          <p class="message-text">${message}</p>
          <div class="clearfix"></div>

        </div>
      `;
      $("#chatContainer").append(html);
      scrollToBottom();
    }

    function receiveMessage(message) {
      var html = `
        <div class="message message-receiver">
          <p class="message-text">${message}</p>
                    <div class="clearfix"></div>
        </div>
      `;
      $("#chatContainer").append(html);
    }

    function scrollToBottom() {
      var chatContainer = document.getElementById("chatContainer");
      chatContainer.scrollTop = chatContainer.scrollHeight;
    }
  });