package src;

public class Snippet {
	@import "reset.css";
	body{
	    background-color:#f6f9fc;
	    font-family : -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
	    display:flex;
	    flex-direction:column;
	    align-items: center;
	    padding:50px 0;
	
	}
	
	.canvas{
	    width:700px;
	    height:700px;
	    background-color:#fff;
	    border-radius:15px;
	    box-shadow: 0 4px 6px rgba(50, 50, 93, 0.11), 0 1px 3px rgba(0, 0, 0, 0.00);
	}
	
	.controls{
	    margin-top:80px;
	    display:flex;
	    flex-direction: column;
	    align-items:center;
	}
	
	.controls .controls_btns{
	    margin-bottom:30px;
	}
	.controls_btns button{
	    all:unset;
	    cursor:pointer;
	    background-color:#fff;
	    padding:5px 0px;
	    width:80px;
	    text-align:center;
	    border-radius: 5px;
	    box-shadow: 0 4px 6px rgba(50, 50, 93, 0.11), 0 1px 3px rgba(0, 0, 0, 0.00);
	    border:1px solid rgba(0,0,0, 0.2);
	    color:rgba(0, 0, 0, 0.8);
	    text-transform: uppercase;
	    font-weight:600;
	    font-size:15px;
	}
	.controls_btns button:active{
	    transform:scale(0.98);
	}
	.controls .controls_colors{
	    display:flex;
	}
	.controls_colors .controls_color{
	    width:50px;
	    height:50px;
	    border-radius:25px;
	    cursor:pointer;
	    box-shadow: 0 4px 6px rgba(50, 50, 93, 0.11), 0 1px 3px rgba(0, 0, 0, 0.00);
	}
	.controls .controls_range{
	    margin-bottom:50px;
	}
}

