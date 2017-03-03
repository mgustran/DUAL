<div id="item{{carID}}" class="item">
			<b>{{product_name}}</b> 
			<br>
			<img src="{{image_source}}" class='logo' >
			<br>
			{{#if gear_type}}
			<b>Gear: <i>Automatical</i></b>
			{{else}}
			<b>Gear: <i>Manual</i></b>
			{{/if}}
			<div id="plate">{{carID}}</div>
			{{#if stock}}
			<button id="buy-btn" class='singup-btn' onclick="buy('{{carID}}','{{gear_type}}','{{product_name}}')">Rent</button>
			{{else}}
			<button id="out-btn" class='singup-btn'>Out of Stock</button>
			{{/if}}
		</div>