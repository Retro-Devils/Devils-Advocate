.class Lcom/digdroid/alman/dig/o2$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2;->U1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/o2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$c;->b:Lcom/digdroid/alman/dig/o2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/o2$c;->b:Lcom/digdroid/alman/dig/o2;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
