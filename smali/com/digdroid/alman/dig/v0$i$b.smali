.class Lcom/digdroid/alman/dig/v0$i$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v0$i;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/v0$i;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v0$i;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$i$b;->b:Lcom/digdroid/alman/dig/v0$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$i$b;->b:Lcom/digdroid/alman/dig/v0$i;

    iget-object p1, p1, Lcom/digdroid/alman/dig/v0$i;->b:Lcom/digdroid/alman/dig/v0;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/digdroid/alman/dig/v0;->i:Z

    iget-object p1, p1, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v0, "games_preview_play_mobile"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    return-void
.end method
