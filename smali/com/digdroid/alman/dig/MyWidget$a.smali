.class Lcom/digdroid/alman/dig/MyWidget$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MyWidget;->a(Landroid/app/Activity;JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/b3;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:J


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/b3;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$a;->b:Landroid/app/Activity;

    iput-object p2, p0, Lcom/digdroid/alman/dig/MyWidget$a;->c:Lcom/digdroid/alman/dig/b3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/MyWidget$a;->d:Ljava/lang/String;

    iput-wide p4, p0, Lcom/digdroid/alman/dig/MyWidget$a;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/MyWidget$a;->b:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/MyWidget$a;->b:Landroid/app/Activity;

    const v2, 0x7f11008c

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/MyWidget$a$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/MyWidget$a$b;-><init>(Lcom/digdroid/alman/dig/MyWidget$a;)V

    const v2, 0x7f110299

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/MyWidget$a$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/MyWidget$a$a;-><init>(Lcom/digdroid/alman/dig/MyWidget$a;)V

    const v2, 0x7f11029a

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
