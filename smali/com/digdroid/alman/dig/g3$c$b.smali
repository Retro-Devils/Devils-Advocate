.class Lcom/digdroid/alman/dig/g3$c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3$c;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/g3$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object v0, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    const-string v1, "___tmp_system_rom_path"

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/digdroid/alman/dig/i;

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    const/16 v0, 0x68

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/i;->f(I)V

    new-instance v0, Lcom/digdroid/alman/dig/g3$c$b$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g3$c$b$a;-><init>(Lcom/digdroid/alman/dig/g3$c$b;)V

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/i;->h(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    return-void
.end method
