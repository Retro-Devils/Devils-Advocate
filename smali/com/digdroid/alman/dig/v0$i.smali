.class Lcom/digdroid/alman/dig/v0$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v0;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/Switch;

.field final synthetic b:Lcom/digdroid/alman/dig/v0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v0;Landroid/widget/Switch;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$i;->b:Lcom/digdroid/alman/dig/v0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/v0$i;->a:Landroid/widget/Switch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0$i;->b:Lcom/digdroid/alman/dig/v0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f11008b

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101da

    new-instance v2, Lcom/digdroid/alman/dig/v0$i$b;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/v0$i$b;-><init>(Lcom/digdroid/alman/dig/v0$i;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f11005a

    new-instance v2, Lcom/digdroid/alman/dig/v0$i$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/v0$i$a;-><init>(Lcom/digdroid/alman/dig/v0$i;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/v0$i;->b:Lcom/digdroid/alman/dig/v0;

    iput-boolean p1, v0, Lcom/digdroid/alman/dig/v0;->i:Z

    iget-object v0, v0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/c3;

    const-string v1, "games_preview_play_mobile"

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$i;->b:Lcom/digdroid/alman/dig/v0;

    invoke-static {p1}, Lcom/digdroid/alman/dig/v0;->b(Lcom/digdroid/alman/dig/v0;)Lcom/digdroid/alman/dig/o2;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$i;->b:Lcom/digdroid/alman/dig/v0;

    invoke-static {p1}, Lcom/digdroid/alman/dig/v0;->b(Lcom/digdroid/alman/dig/v0;)Lcom/digdroid/alman/dig/o2;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/o2;->y(Z)V

    :cond_1
    return-void
.end method
