from telegram import Update, InlineKeyboardButton, InlineKeyboardMarkup
from telegram.ext import Application, CommandHandler, ContextTypes, CallbackQueryHandler

api_key = '5463989628:AAHRIzmOhxMBdiWk3Gp_KE09Nu9oidOfg8U'

from datetime import datetime

def sample_responses(input_text, effective_user):
    user_message = str(input_text).lower()
    
    if user_message in ('hello', 'hi', 'привет', 'ghbdtn', 'hallo', 'хай', 'хелло', 'добрый день','1'):
        return f'Halo, {effective_user["first_name"]}!'

    if user_message in ('время', 'время?', '2'):
        now = datetime.now()
        date_time = now.strftime('%d/%m/%y, %H:%M:%S')
        return str(date_time)

    if user_message in ('ты кто', 'ты кто?', '3'):
        return 'Я бот Кармы.'
    
    return 'Неизвестная команда.'

print('Бот начал работу...')


async def start_command(update: Update, context):
    keyboard = [
        [
            InlineKeyboardButton('Поздороваться', callback_data='1'),
            InlineKeyboardButton('Спросить время', callback_data='2'),
        ],
        [InlineKeyboardButton('Узнать, кто я', callback_data = '3')],
    ]
    reply_markup = InlineKeyboardMarkup(keyboard)

    await update.message.reply_text("Eсли вы хотите узнать, что я умею, выберите из списка ниже:", reply_markup=reply_markup)

async def help_command(update: Update, context: ContextTypes.DEFAULT_TYPE) -> None:
    await update.message.reply_text('Помочь вам нечем. Помогите себе сами!\nА если вы хотите узнать, что я умею, запустите команду "/start"')

def handle_message(update: Update, context):
    text = str(update.message.text).lower()
    response = sample_responses(text, update.effective_user)

    update.message.reply_text(response)

def error(update: Update, context):
    print(f'Ваше сообщение "{update}" вызвало ошибку: {context}.')
    update.message.reply_text('Что-то пошло не так.')

async def button(update: Update, context: ContextTypes.DEFAULT_TYPE) -> None:
    query = update.callback_query
    response = sample_responses(query.data, update.effective_user)
    await query.answer()
    # await query.edit_message_text(text=f"Вы выбрали: {query.data}")
    await query.edit_message_text(response)

def main():
    dp = Application.builder().token(api_key).build()
    dp.add_handler(CommandHandler('start', start_command))
    dp.add_handler(CallbackQueryHandler(button))
    dp.add_handler(CommandHandler('help', help_command))

    # dp.add_handler(MessageHandler(filters.TEXT, handle_message))

    dp.add_error_handler(error)

    dp.run_polling()

main()






