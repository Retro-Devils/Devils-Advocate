.class Lcom/digdroid/alman/dig/y3$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/y3;->d1(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/y3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y3$b;->b:Lcom/digdroid/alman/dig/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/y3$b;->b:Lcom/digdroid/alman/dig/y3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/digdroid/alman/dig/b3;->g:Z

    return-void
.end method
